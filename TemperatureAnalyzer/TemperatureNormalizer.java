import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class TemperatureNormalizer
{
    private double[] data;

    /**
     /* Constructs a TemperatureNormalizer with the given array
     /* @param the array to process
     */
    public TemperatureNormalizer(double[] data)
    {
        this.data = data;
    }

    /**
     * Gets the adjusted average of the values in this array. The adjusted average
     * is calculated by removing the highest and lowest values and calculating
     * the average of the values that are left
     * @return the adjusted average
     */
    public double getAdjustedAverage()
    {
        double adjustedAverage = 0;
        int length = data.length;
        adjustedAverage = (getSum() - ( getMax() + getMin())) / (length - 2);
        return adjustedAverage;
    }

    /**
     * Gets the maximum value in the array of doubles
     *
     * @return the maximum value
     */
    public double getMax()
    {
        return DoubleStream.of(data).max().orElseThrow();
    }

    /**
     * Gets the minimum value in the array of doubles
     *
     * @return the minimum value
     */
    public double getMin()
    {
        return DoubleStream.of(data).min().orElseThrow();
    }

    /**
     * Gets the sum of the values in the array
     * @return the sum of the values in the array
     */
    public double getSum()
    {
        return DoubleStream.of(data).sum();
    }
}