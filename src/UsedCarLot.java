import java.util.ArrayList;

/**
 *This class represents a used car lot
 *
 * @author Aaron Yeung
 */

public class UsedCarLot {
    /** The used car lot inventory */
    private ArrayList<Car> inventory;

    /**
     * Creates a UsedCarLot object
     *
     */
    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    /**
     * Returns the current inventory of the used car lot
     *
     * @return The inventory of the used car lot
     */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /**
     * Adds a car to the inventory at the end
     *
     * @param car The new car added
     *
     */
    public void addCar(Car car)
    {
        inventory.add(car);
    }

    /**
     * Swaps the places of two cars
     *
     * @param ind1 The index of the first car
     * @param ind2 the index of the second car
     * @return Returns true of swap was successful
     */
    public boolean swapCars(int ind1, int ind2)
    {
        if (ind1 < inventory.size() && ind2 < inventory.size() && ind1 >= 0 && ind2 >= 0)
        {
            Car car = inventory.get(ind1);
            inventory.set(ind1, inventory.get(ind2));
            inventory.set(ind2, car);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Adds a car to the inventory in a specific place
     *
     * @param indexToAdd The index of the place wanted to add
     * @param carToAdd The car added
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Removes the car of the index from inventory and shortens length of inventory by 1
     *
     * @param indexOfCarToSell The index of the car removed
     * @return Returns the car sold/removed from inventory
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        Car car = inventory.remove(indexOfCarToSell);
        return car;
    }

    /**
     * Removes the car of the index from inventory and replaces it with an empty space
     *
     * @param indexOfCarToSell The index of the car removed
     * @return Returns the car sold/removed from inventory
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car car = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return car;
    }

    /**
     * Moves the car of the chosen index to a different index
     * <p>
     * PRECONDITION: Index are greater than 0 and less than the length + 1
     *
     * @param indexOfCarToMove The index of the car to move
     * @param destinationIndex The place where to move the car
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car car = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, car);
    }






}
