abstract class Gadget implements SmartDevice {
    abstract void receiveNotification(String message);
    abstract void batteryStatus();
}

abstract class MiniGadgets extends Gadget {
    abstract void showGPS();
}
class SmartPhone extends MiniGadgets {
    @Override
    public void turnOn() {
        System.out.println("SmartPhone is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartPhone is turned off.");
    }

    @Override
    public void connectToInternet() {
        System.out.println("SmartPhone is connected to the internet.");
    }

    @Override
    void receiveNotification(String message) {
        System.out.println("SmartPhone received a notification: " + message);
    }

    @Override
    void batteryStatus() {
        System.out.println("SmartPhone battery: 80%");
    }

    void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
    void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("SmartPhone connected to another device.");
    }
    @Override
    void showGPS() {
        System.out.println("SmartPhone GPS coordinates: 123.456, 789.012");
    }
}


class SmartWatch extends MiniGadgets {
    @Override
    public void turnOn() {
        System.out.println("SmartWatch is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartWatch is turned off.");
    }

    @Override
    public void connectToInternet() {
        System.out.println("SmartWatch is connected to the internet.");
    }

    @Override
    void receiveNotification(String message) {
        System.out.println("SmartWatch received a notification: " + message);
    }

    @Override
    void batteryStatus() {
        System.out.println("SmartWatch battery: 70%");
    }

    void trackHeartRate() {
        System.out.println("Tracking heart rate.");
    }

    void showTime() {
        System.out.println("Displaying time.");
    }

    void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("SmartWatch connected to another device.");
    }
    @Override
    void showGPS() {
        System.out.println("SmartWatch GPS coordinates: 456.789, 012.345");
    }
}


class SmartTV extends Gadget {
    @Override
    public void turnOn() {
        System.out.println("SmartTV is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTV is turned off.");
    }

    @Override
    public void connectToInternet() {
        System.out.println("SmartTV is connected to the internet.");
    }

    @Override
    void receiveNotification(String message) {
        System.out.println("SmartTV received a notification: " + message);
    }

    @Override
    void batteryStatus() {
        System.out.println("SmartTV doesn't have a battery.");
    }

    void streamVideo(String url) {
        System.out.println("Streaming video from " + url);
    }

    void changeChannel(int channel) {
        System.out.println("Changing TV channel to " + channel);
    }

    void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("SmartTV connected to another device.");
    }
}