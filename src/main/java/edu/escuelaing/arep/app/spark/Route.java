package edu.escuelaing.arep.app.spark;

public interface Route {
    String handle(Request req, Response res);
}
