open module GPU_Matrix {
    requires transitive java.desktop;
    requires transitive tornado.api;
    requires transitive tornado.matrices;

    exports org.example;
}
