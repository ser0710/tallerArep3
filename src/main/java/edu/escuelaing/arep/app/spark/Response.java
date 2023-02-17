package edu.escuelaing.arep.app.spark;

public class Response {

    private String body = null;
    private String path;

    private String type;

    public String getBody(){
        return body;
    }

    public String getHeader(){
        return "HTTP/1.1 200 \r\n" +
                "Content-Type:" +type+ "\r\n" +
                "\r\n";
    }

    public void setBody(String s) {
        this.body = s;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResponse() {
        return getHeader() + getBody();
    }
}
