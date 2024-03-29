package br.com.fiap.classes;
 
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
public class Servidor {
    private static final int PORTA = 9600;
    private static final String UNIDADE_PERSISTENCIA = "ProdutoPU";
 
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORTA);
            System.out.println("Servidor iniciado na porta " + PORTA);
 
            while (true) {
                final Socket socketCliente = serverSocket.accept();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            String idProduto = ConexaoTCP.receber(socketCliente);
                            String produto = buscarProdutoPorId(idProduto);
                            if (produto != null) {
                                ConexaoTCP.enviar(socketCliente, produto);
                            } else {
                                ConexaoTCP.enviar(socketCliente, "Produto não encontrado.");
                            }
                            socketCliente.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    private static String buscarProdutoPorId(String idProduto) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(UNIDADE_PERSISTENCIA);
        EntityManager em = emf.createEntityManager();
        Produto produto = null;
        String resultado = "";
        try {
            int id = Integer.parseInt(idProduto);
            produto = em.find(Produto.class, id);
            if (produto != null) {
                resultado = produto.toString();
            } else {
                resultado = "Produto não encontrado.";
            }
        } catch (NumberFormatException e) {
            System.err.println("ID do produto inválido: " + idProduto);
            e.printStackTrace();
            resultado = "ID do produto inválido.";
        }

        return resultado;
    }

}