/**
 * The type Shape.
 */
public class Shape {
    /**
     * The Shape name.
     */
    protected String shapeName;
    /**
     * The Number of edges.
     */
    protected int numberOfEdges;

    /**
     * Instantiates a new Shape.
     */
    public Shape() {
        this.shapeName = null;
        System.out.println("\na new form has been created");
    }

    /**
     * Gets shape name.
     *
     * @return the shape name
     */
    public String getShapeName() {
        return shapeName;
    }

    /**
     * Sets shape name.
     *
     * @param shapeName the shape name
     */
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    /**
     * Gets number of edges.
     *
     * @return the number of edges
     */
    public int getNumberOfEdges() {
        return numberOfEdges;
    }

    /**
     * Sets number of edges.
     *
     * @param numberOfEdges the number of edges
     */
    public void setNumberOfEdges(int numberOfEdges) {
        this.numberOfEdges = numberOfEdges;
    }

    /**
     * Get shape details.
     */
    public void getShapeDetails(){
        System.out.println("\nShape name: " + shapeName + "\nNumber of edges: " + numberOfEdges);
    }
}
