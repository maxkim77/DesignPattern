public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        RemoteControl remote = new RemoteControl();

        // 조명을 켠다
        remote.setCommand(lightOn);
        remote.pressButton();  // 출력: Light is on

        // 조명을 끈다
        remote.setCommand(lightOff);
        remote.pressButton();  // 출력: Light is off
    }
}
