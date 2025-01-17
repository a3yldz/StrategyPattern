class SortContext {
    private SortStrategy sortStrategy;

    public SortContext(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public SortStrategy getSortStrategy() {
        return sortStrategy;
    }

    public void setSortingStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void performSort(int[] array) {
        sortStrategy.sort(array);
    }
}
