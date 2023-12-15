package line;

import model.Product;

public class Laptop implements IAssemblyLine{
    @Override
    public IProduct assembleProduct(IProduct iProduct) {
        ProductFrame frame = (ProductFrame) new CreatureFirstPart().buildProductPart();
        iProduct.installFirstPart(frame);

        ProductMotherboard motherboard = (ProductMotherboard) new CreatureSecondPart().buildProductPart();
        iProduct.installSecondPart(motherboard);

        ProductMonitor monitor = (ProductMonitor) new CreatureThirdPart().buildProductPart();
        iProduct.installThirdPart(monitor);

        InstallationProducts installation = new InstallationProducts(frame, motherboard,monitor);
        System.out.println("Ок,ноутбук собран");

        return installation;
    }

}
