package org.zjgsu.example;

import java.util.Random;

/**
 * Created by wuhanqing on 2017/4/4.
 */
public class ComputeParam {

    public static void main(String[] args) {
        String data =
                "0.8299617998948318\n" +
                "0.8178045247875448\n" +
                "0.8705661070319025\n" +
                "0.8178045247875448\n" +
                "0.8567347611817618\n" +
                "0.8299617998948318\n" +
                "0.8441853159097237\n" +
                "0.8431372549019608\n" +
                "0.8441853159097237\n" +
                "0.8567347611817618\n" +
                "example1\n" +
                "0.8299617998948318\n" +
                "0.8441853159097237\n" +
                "0.8567347611817618\n" +
                "0.8299617998948318\n" +
                "0.8178045247875448\n" +
                "0.8567347611817618\n" +
                "0.8441853159097237\n" +
                "0.8529411764705882\n" +
                "0.8333333333333334\n" +
                "0.8299617998948318\n" +
                "example1\n" +
                "0.8567347611817618\n" +
                "0.8299617998948318\n" +
                "0.8299617998948318\n" +
                "0.8441853159097237\n" +
                "0.8705661070319025\n" +
                "0.8441853159097237\n" +
                "0.8705661070319025\n" +
                "0.8627450980392157\n" +
                "0.8529411764705882\n" +
                "0.8529411764705882\n" +
                "example1\n" +
                "0.8567347611817618\n" +
                "0.8441853159097237\n" +
                "0.8627450980392157\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8299617998948318\n" +
                "0.8567347611817618\n" +
                "0.8529411764705882\n" +
                "0.8567347611817618\n" +
                "example1\n" +
                "0.8431372549019608\n" +
                "0.8705661070319025\n" +
                "0.8441853159097237\n" +
                "0.8441853159097237\n" +
                "0.8627450980392157\n" +
                "0.8705661070319025\n" +
                "0.8299617998948318\n" +
                "0.8299617998948318\n" +
                "0.8299617998948318\n" +
                "0.8705661070319025\n" +
                "example1\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8299617998948318\n" +
                "0.8835077224686919\n" +
                "0.8299617998948318\n" +
                "0.8441853159097237\n" +
                "0.8441853159097237\n" +
                "0.8705661070319025\n" +
                "example1\n" +
                "0.8567347611817618\n" +
                "0.8441853159097237\n" +
                "0.8441853159097237\n" +
                "0.8705661070319025\n" +
                "0.8567347611817618\n" +
                "0.8441853159097237\n" +
                "0.8567347611817618\n" +
                "0.8441853159097237\n" +
                "0.8529411764705882\n" +
                "0.8529411764705882\n" +
                "example1\n" +
                "0.8567347611817618\n" +
                "0.8705661070319025\n" +
                "0.8567347611817618\n" +
                "0.8441853159097237\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8627450980392157\n" +
                "0.8529411764705882\n" +
                "0.8705661070319025\n" +
                "example1\n" +
                "0.8178045247875448\n" +
                "0.8567347611817618\n" +
                "0.8441853159097237\n" +
                "0.8567347611817618\n" +
                "0.8705661070319025\n" +
                "0.8431372549019608\n" +
                "0.8567347611817618\n" +
                "0.8705661070319025\n" +
                "0.8529411764705882\n" +
                "0.8178045247875448\n" +
                "example1\n" +
                "0.8441853159097237\n" +
                "0.8299617998948318\n" +
                "0.8529411764705882\n" +
                "0.8627450980392157\n" +
                "0.8299617998948318\n" +
                "0.8567347611817618\n" +
                "0.8705661070319025\n" +
                "0.8299617998948318\n" +
                "0.875\n" +
                "0.8567347611817618\n" +
                "example1\n" +
                "0.8529411764705882\n" +
                "0.8441853159097237\n" +
                "0.875\n" +
                "0.8441853159097237\n" +
                "0.8567347611817618\n" +
                "0.8529411764705882\n" +
                "0.8178045247875448\n" +
                "0.8567347611817618\n" +
                "0.8705661070319025\n" +
                "0.8567347611817618\n" +
                "example1\n" +
                "0.8529411764705882\n" +
                "0.8705661070319025\n" +
                "0.8431372549019608\n" +
                "0.8705661070319025\n" +
                "0.8705661070319025\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8178045247875448\n" +
                "0.8567347611817618\n" +
                "0.8299617998948318\n" +
                "example1\n" +
                "0.8567347611817618\n" +
                "0.8441853159097237\n" +
                "0.8705661070319025\n" +
                "0.8441853159097237\n" +
                "0.8441853159097237\n" +
                "0.8823529411764706\n" +
                "0.8725490196078431\n" +
                "0.8178045247875448\n" +
                "0.8441853159097237\n" +
                "0.8299617998948318\n" +
                "example1\n" +
                "0.8529411764705882\n" +
                "0.8299617998948318\n" +
                "0.8441853159097237\n" +
                "0.8567347611817618\n" +
                "0.8299617998948318\n" +
                "0.8567347611817618\n" +
                "0.8299617998948318\n" +
                "0.8441853159097237\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "example1\n" +
                "0.8333333333333334\n" +
                "0.8441853159097237\n" +
                "0.8529411764705882\n" +
                "0.8299617998948318\n" +
                "0.8567347611817618\n" +
                "0.8705661070319025\n" +
                "0.8441853159097237\n" +
                "0.8441853159097237\n" +
                "0.8441853159097237\n" +
                "0.8299617998948318\n" +
                "example1\n" +
                "0.8441853159097237\n" +
                "0.8529411764705882\n" +
                "0.8441853159097237\n" +
                "0.8725490196078431\n" +
                "0.8823529411764706\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8441853159097237\n" +
                "0.8299617998948318\n" +
                "example1\n" +
                "0.8705661070319025\n" +
                "0.8567347611817618\n" +
                "0.8627450980392157\n" +
                "0.8567347611817618\n" +
                "0.8299617998948318\n" +
                "0.8567347611817618\n" +
                "0.8178045247875448\n" +
                "0.8299617998948318\n" +
                "0.8567347611817618\n" +
                "0.8705661070319025\n" +
                "example1\n" +
                "0.8705661070319025\n" +
                "0.8705661070319025\n" +
                "0.8441853159097237\n" +
                "0.8431372549019608\n" +
                "0.8529411764705882\n" +
                "0.8441853159097237\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8705661070319025\n" +
                "example1\n" +
                "0.8835077224686919\n" +
                "0.8567347611817618\n" +
                "0.8441853159097237\n" +
                "0.8705661070319025\n" +
                "0.8705661070319025\n" +
                "0.8441853159097237\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8529411764705882\n" +
                "0.8441853159097237\n" +
                "example1\n" +
                "0.8567347611817618\n" +
                "0.8705661070319025\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8441853159097237\n" +
                "0.8441853159097237\n" +
                "0.8567347611817618\n" +
                "0.8431372549019608\n" +
                "0.8441853159097237\n" +
                "0.8567347611817618\n" +
                "example1\n" +
                "0.8567347611817618\n" +
                "0.8529411764705882\n" +
                "0.8705661070319025\n" +
                "0.8431372549019608\n" +
                "0.8567347611817618\n" +
                "0.8705661070319025\n" +
                "0.8529411764705882\n" +
                "0.8529411764705882\n" +
                "0.8431372549019608\n" +
                "0.8441853159097237\n" +
                "example1\n" +
                "0.8705661070319025\n" +
                "0.8705661070319025\n" +
                "0.8441853159097237\n" +
                "0.8299617998948318\n" +
                "0.8567347611817618\n" +
                "0.8725490196078431\n" +
                "0.8705661070319025\n" +
                "0.8705661070319025\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "example1\n" +
                "0.8567347611817618\n" +
                "0.8299617998948318\n" +
                "0.8299617998948318\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8333333333333334\n" +
                "0.8705661070319025\n" +
                "0.8299617998948318\n" +
                "0.8441853159097237\n" +
                "0.8431372549019608\n" +
                "example1\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8627450980392157\n" +
                "0.8567347611817618\n" +
                "0.8725490196078431\n" +
                "0.8441853159097237\n" +
                "0.8529411764705882\n" +
                "0.8431372549019608\n" +
                "0.8441853159097237\n" +
                "0.8299617998948318\n" +
                "example1\n" +
                "0.8705661070319025\n" +
                "0.8567347611817618\n" +
                "0.8705661070319025\n" +
                "0.8567347611817618\n" +
                "0.8567347611817618\n" +
                "0.8705661070319025\n" +
                "0.8333333333333334\n" +
                "0.8705661070319025\n" +
                "0.8441853159097237\n" +
                "0.8567347611817618";

        double d = 0.8835077224686919;
        double result = 0;
        String[] aa = data.split("example1\n");
        for (int i = 0; i < aa.length; i++) {
            String[] a = aa[i].split("\n");
            for (int j = 0; j < a.length; j++) {
                String c = a[j];
                double n = Double.valueOf(c);
                double b = (d - n) / d;
                result += b;
            }
            result = result / a.length;
            System.out.println(result);
        }

    }

}