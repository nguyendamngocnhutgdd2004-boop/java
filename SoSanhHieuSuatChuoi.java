public class SoSanhHieuSuatChuoi {
    public static void main(String[] args) {
        int loopString = 100000;       // 100 nghin lan cho String de tranh treo may
        int loopBuilderBuffer = 1000000; // 1 trieu lan cho StringBuilder va StringBuffer

        System.out.println("--- BAT DAU DO THOI GIAN ---");

        // 1. Kiem tra hieu suat cua String
        long startTime = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < loopString; i++) {
            str += " World";
        }
        long endTime = System.currentTimeMillis();
        long timeString = endTime - startTime;
        System.out.println("Thoi gian chay cua String (" + loopString + " lan): " + timeString + " ms");

        // 2. Kiem tra hieu suat cua StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sBuffer = new StringBuffer("Hello");
        for (int i = 0; i < loopBuilderBuffer; i++) {
            sBuffer.append(" World");
        }
        endTime = System.currentTimeMillis();
        long timeBuffer = endTime - startTime;
        System.out.println("Thoi gian chay cua StringBuffer (" + loopBuilderBuffer + " lan): " + timeBuffer + " ms");

        // 3. Kiem tra hieu suat cua StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sBuilder = new StringBuilder("Hello");
        for (int i = 0; i < loopBuilderBuffer; i++) {
            sBuilder.append(" World");
        }
        endTime = System.currentTimeMillis();
        long timeBuilder = endTime - startTime;
        System.out.println("Thoi gian chay cua StringBuilder (" + loopBuilderBuffer + " lan): " + timeBuilder + " ms");
    }
}
