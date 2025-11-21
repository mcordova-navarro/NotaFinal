import java.net.URL;

interface Machine {
    Machine convertURL();
    Machine saveUrl(URL url, String action);
    Machine removeUrl(URL url, String action);
}





