package edu.escuelaing.arep.app.services;

import edu.escuelaing.arep.app.HttpServer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

public class WebImg implements Services{

    @Override
    public String head() {
        return null;
    }

    @Override
    public String body() throws IOException {
        String response = "HTTP/1.1 200 \r\n" +
                        "Content-Type: image/jpg \r\n" +
                        "\r\n";
        BufferedImage bufferedImage = ImageIO.read(new File("src/main/resources/imagen.jpg"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HttpServer server = HttpServer.getInstance();
        DataOutputStream dataOutputStream = new DataOutputStream(server.getOutputStream());
        ImageIO.write(bufferedImage, "jpg", byteArrayOutputStream);
        dataOutputStream.writeBytes(response);
        dataOutputStream.write(byteArrayOutputStream.toByteArray());
        return response;
    }
}
