package week12;

public class Class12_4_2_Apple_Device_Configuration_OOP {

    class AppleDevice{

        public String model;// Represents the model of the Apple device.

        public int storage;// Represents the storage capacity of the device in gigabytes.

       public double price;// Represents the price of the device.

        public boolean cellular;// Indicates whether the device has cellular capabilities (true or false).

        public String color;// Represents the color of the device.

        public String osVersion;// Indicates the installed operating system (OS) version.

        public boolean hasTouchID;// Specifies whether the device has Touch ID (true or false).

        public AppleDevice (String model,int storage,double price) {
            this(model,storage,price,false,"Space Gray","none",false);
        }

        public AppleDevice (String model,int storage,double price,boolean cellular) {
            this(model,storage,price,cellular,"Space Gray","none",false);
        }

        public AppleDevice (String model,int storage,double price,boolean cellular,String color) {
            this(model,storage,price,cellular,color,"none",false);
        }

        public AppleDevice(String model, int storage, double price, boolean cellular, String color, String osVersion, boolean hasTouchID) {
            this.model = model;
            this.storage = storage;
            this.price = price;
            this.cellular = cellular;
            this.color = color;
            this.osVersion = osVersion;
            this.hasTouchID = hasTouchID;
        }
    }
}
