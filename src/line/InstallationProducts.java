package line;

public class InstallationProducts implements IProduct{
    IProductPart frame;
    IProductPart motherboard;
    IProductPart monitor;
    InstallationProducts(ProductFrame frame, ProductMotherboard motherboard, ProductMonitor monitor){
        this.frame = frame;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
    @Override
    public void installFirstPart(IProductPart productPart){
        System.out.println();
    }
}