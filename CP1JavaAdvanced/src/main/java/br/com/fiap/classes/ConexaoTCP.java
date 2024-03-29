package br.com.fiap.classes;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ConexaoTCP {

	public static String receber(Socket socket) throws IOException {
	    InputStream in = socket.getInputStream();
	    byte[] buffer = new byte[1024]; 
	    int bytesLidos = in.read(buffer); 

	    if (bytesLidos > 0) {
	        return new String(buffer, 0, bytesLidos); 
	    } else {
	        return ""; 
	    }
	}


    public static void enviar(Socket socket, String textoRequisicao) throws IOException {
        OutputStream out = socket.getOutputStream();
        out.write(textoRequisicao.getBytes());
    }
}
