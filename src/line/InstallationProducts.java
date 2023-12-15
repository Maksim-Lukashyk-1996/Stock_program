package line;

public class InstallationProducts{
    IProductPart frame;
    IProductPart motherboard;
    IProductPart monitor;
    InstallationProducts(ProductFrame frame, ProductMotherboard motherboard, ProductMonitor monitor){
        this.frame = frame;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
}