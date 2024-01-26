public class Main {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();
        SmartWatch smartwatch = new SmartWatch();
        SmartTV smarttv = new SmartTV();


        smartphone.turnOn();
        smartphone.connectToInternet();
        smartphone.makeCall("123456789");
        smartphone.sendSMS("Hello, how are you?");
        smartphone.receiveNotification("New message received.");
        smartphone.batteryStatus();
        smartphone.connectToDevice(smarttv);
        smartphone.showGPS();


        smartwatch.turnOn();
        smartwatch.connectToInternet();
        smartwatch.trackHeartRate();
        smartwatch.showTime();
        smartwatch.receiveNotification("Meeting at 2 PM.");
        smartwatch.batteryStatus();
        smartwatch.connectToDevice(smartphone);
        smartwatch.showGPS();


        smarttv.turnOn();
        smarttv.connectToInternet();
        smarttv.streamVideo("https://example.com/video.mp4");
        smarttv.changeChannel(5);
        smarttv.receiveNotification("News update.");
        smarttv.connectToDevice(smartwatch);
    }
}