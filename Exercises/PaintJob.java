package Exercises;

//Please refer PaintJob.txt for problem statement.
public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.26, 0.75));
    }
    //width: width of the wall
    //height: height of the wall
    //areaPerBucket: This parameter represents the area that can be covered with one bucket of paint.
    //extraBuckets: This parameter represents the bucket count that Bob has at home.
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets ){
        if(width <= 0 || height <=0 || areaPerBucket <= 0 || extraBuckets < 0 ){
            return -1;
        }else{
            double area = width * height;
            int oriBucket = extraBuckets;
            while (areaPerBucket * extraBuckets < area){
                extraBuckets++;
            }
             extraBuckets -= oriBucket;
            return extraBuckets;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <=0 || areaPerBucket <= 0 ){
            return -1;
        }else{
            double area = width * height;
            int extraBuckets = 0;
            while (areaPerBucket * extraBuckets < area){
                extraBuckets++;
            }
            return extraBuckets;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <=0 || areaPerBucket <= 0 ){
            return -1;
        }else{
            int extraBuckets = 0;
            while (areaPerBucket * extraBuckets < area){
                extraBuckets++;
            }
            return extraBuckets;
        }
    }
}
