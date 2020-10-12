package com.shadow.common.util;

/**
 * 类 描 述：数字工具类
 * 创 建 人：Shadow
 * 创建时间：2020年10月12日 17时24分46秒
 */
public class NumberUtil {

    private NumberUtil() {
    }

    /**
     * int转byte数组
     *
     * @param i
     * @return byte.length==4
     */
    public static byte[] intToByteArray(int i) {
        byte[] result = new byte[4];
        // 由高位到低位
        result[0] = (byte) ((i >> 24) & 0xFF);
        result[1] = (byte) ((i >> 16) & 0xFF);
        result[2] = (byte) ((i >> 8) & 0xFF);
        result[3] = (byte) (i & 0xFF);
        return result;
    }

    /**
     * bytes数组长度为4
     *
     * @param bytes
     * @return
     */
    public static int byteToInt4(byte[] bytes) {
        int value;
        value = ((bytes[3] & 0xFF)
                | ((bytes[2] << 8) & 0xFF00)
                | ((bytes[1] << 16) & 0xFF0000)
                | ((bytes[0] << 24) & 0xFF000000));
        return value;
    }

    public static int byteArrayToInt(byte[] bytes) {
        if (bytes.length < 4) {
            byte[] cur = new byte[4];
            System.arraycopy(bytes, 0, cur, 4 - bytes.length, bytes.length);
            bytes = cur;
        }
        int value = 0;
        // 由高位到低位
        for (int i = 0; i < 4; i++) {
            int shift = (4 - 1 - i) * 8;
            // 往高位游
            value += (bytes[i] & 0x000000FF) << shift;
        }
        return value;
    }

    /**
     * 设置指定的bit位为0
     *
     * @param originByte
     * @param bitIndex
     * @return
     */
    public static byte setSpecifiedBitTo0(byte originByte, int bitIndex) {
        return originByte &= ~(1 << bitIndex);
    }

    /**
     * 设置指定的bit位为1
     *
     * @param originByte
     * @param bitIndex
     * @return
     */
    public static byte setSpecifiedBitTo1(byte originByte, int bitIndex) {
        return originByte |= (1 << bitIndex);
    }

    /**
     * 把指定bit位的值反转
     * @param originByte
     * @param bitIndex
     * @return
     */
    public static byte setSpecifiedBitToReverse(byte originByte, int bitIndex) {
        return originByte ^= (1 << bitIndex);
    }

    /**
     * 获取指定bit位的值
     *
     * @param originByte
     * @param bitIndex
     * @return
     */
    public static byte getSpecifiedBitValue(byte originByte, int bitIndex) {
        return (byte) ((originByte) >> (bitIndex) & 1);
    }

    /**
     * 将byte转换为一个长度为8的byte数组，数组每个值代表bit
     */
    public static byte[] getBitArray(byte b) {
        byte[] array = new byte[8];
        for (int i = 7; i >= 0; i--) {
            array[i] = (byte) (b & 1);
            b = (byte) (b >> 1);
        }
        return array;
    }
}
