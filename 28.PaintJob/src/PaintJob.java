
public class PaintJob {
    

    public static int getBucketCount(double widht, double height, double areaPerBucket, int extraBuckets) {
        if (widht <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        if (widht * height <= areaPerBucket * extraBuckets) {
            return 0;
        }
        if (widht * height > areaPerBucket * extraBuckets) {
            return (int) Math.ceil((widht * height - areaPerBucket * extraBuckets) / areaPerBucket);
        }
        return -1;      
    }
    
    
    public static int getBucketCount(double widht, double height, double areaPerBucket) {
        if (widht <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(widht * height / areaPerBucket);
    }
    
    
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
    
}
