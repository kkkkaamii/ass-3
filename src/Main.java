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


        smartwatch.turnOn();
        smartwatch.connectToInternet();
        smartwatch.trackHeartRate();
        smartwatch.showTime();
        smartwatch.receiveNotification("Meeting at 3 PM.");
        smartwatch.batteryStatus();
        smartwatch.connectToDevice(smartphone);


        smarttv.turnOn();
        smarttv.connectToInternet();
        smarttv.streamVideo("https://example.com/video.mp4");
        smarttv.changeChannel(5);
        smarttv.receiveNotification("News update.");
        smarttv.connectToDevice(smartwatch);
    }
}