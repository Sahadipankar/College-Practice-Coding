import pandas as pd

# Data structure with extended algorithm details
algorithm_data = [
    # Serial No., Name, Type, Best, Average, Worst, Space, Recurrence, Purpose, Remarks
    [1, "Linear Search", "Searching", "O(1)", "O(n)", "O(n)", "O(1)", "-", "Find element in unsorted array", "Simple, no sorting needed"],
    [2, "Binary Search", "Searching", "O(1)", "O(log n)", "O(log n)", "O(1)", "T(n) = T(n/2) + O(1)", "Find element in sorted array", "Fast for sorted arrays"],
    [3, "Interpolation Search", "Searching", "O(log log n)", "O(log log n)", "O(n)", "O(1)", "T(n) = T(f(n)) + O(1)", "Better than binary for uniform distribution", "Efficient on uniformly distributed data"],
    [4, "Bubble Sort", "Sorting", "O(n)", "O(n^2)", "O(n^2)", "O(1)", "T(n) = T(n-1) + O(n)", "Simple sorting", "Stable, easy to implement"],
    [5, "Insertion Sort", "Sorting", "O(n)", "O(n^2)", "O(n^2)", "O(1)", "T(n) = T(n-1) + O(n)", "Good for small/partially sorted arrays", "Stable, adaptive"],
    [6, "Merge Sort", "Sorting", "O(n log n)", "O(n log n)", "O(n log n)", "O(n)", "T(n) = 2T(n/2) + O(n)", "Divide & conquer sorting", "Stable, recursive"],
    [7, "Quick Sort", "Sorting", "O(n log n)", "O(n log n)", "O(n^2)", "O(log n)", "T(n) = T(k) + T(n-k-1) + O(n)", "Efficient in practice", "Not stable, in-place"],
    [8, "Heap Sort", "Sorting", "O(n log n)", "O(n log n)", "O(n log n)", "O(1)", "T(n) = T(n-1) + O(log n)", "In-place sorting using heap", "Not stable"],
    [9, "Counting Sort", "Sorting", "O(n + k)", "O(n + k)", "O(n + k)", "O(k)", "-", "Sorting with known range", "Stable, non-comparison sort"],
    [10, "Radix Sort", "Sorting", "O(nk)", "O(nk)", "O(nk)", "O(n + k)", "-", "Digit-wise sort", "Non-comparison sort"],
    [11, "Bucket Sort", "Sorting", "O(n + k)", "O(n + k)", "O(n^2)", "O(n)", "-", "Sort when data is uniformly distributed", "Efficient if uniform"],
    [12, "Build Heap", "Heap", "-", "-", "O(n)", "O(n)", "-", "Construct heap from array", "Bottom-up approach"],
    [13, "Heap Insert", "Heap", "O(1)", "O(log n)", "O(log n)", "O(1)", "-", "Insert element to heap", "Heapify up"],
    [14, "Heap Delete", "Heap", "O(1)", "O(log n)", "O(log n)", "O(1)", "-", "Remove root element", "Heapify down"],
    [15, "Huffman Coding", "Greedy", "-", "O(n log n)", "-", "O(n)", "-", "Data compression", "Optimal prefix codes"],
    [16, "Prim's Algorithm", "Graph", "O(E + V log V)", "O(E log V)", "O(E log V)", "O(V)", "-", "Minimum Spanning Tree", "Efficient with heap"],
    [17, "Kruskal's Algorithm", "Graph", "O(E log E)", "O(E log E)", "O(E log E)", "O(V)", "-", "Minimum Spanning Tree", "Uses union-find"],
    [18, "Dijkstra's Algorithm", "Graph", "O(V^2)", "O(E + V log V)", "O(E + V log V)", "O(V)", "-", "Single-source shortest path", "Non-negative weights"],
    [19, "Bellman-Ford", "Graph", "O(VE)", "O(VE)", "O(VE)", "O(V)", "-", "Shortest path with negative weights", "Handles -ve edges"],
    [20, "Floyd-Warshall", "Graph", "O(n^3)", "O(n^3)", "O(n^3)", "O(n^2)", "-", "All-pairs shortest paths", "Simple but slow"],
    [21, "Topological Sort", "Graph", "O(V + E)", "O(V + E)", "O(V + E)", "O(V)", "-", "Ordering in DAG", "For scheduling"],
    [22, "DFS", "Graph", "O(V + E)", "O(V + E)", "O(V + E)", "O(V)", "-", "Graph traversal", "Recursive or stack-based"],
    [23, "BFS", "Graph", "O(V + E)", "O(V + E)", "O(V + E)", "O(V)", "-", "Graph traversal", "Queue based"],
    [24, "Matrix Multiplication", "Matrix", "O(n^3)", "-", "-", "O(n^2)", "T(n) = O(n^3)", "Matrix product", "Naive method"],
]

# Convert to DataFrame
df = pd.DataFrame(algorithm_data, columns=[
    "S.No", "Algorithm", "Type", "Best Case", "Average Case", "Worst Case", "Space Complexity",
    "Recurrence Relation", "Purpose", "Remarks"
])

# Save to Excel
excel_path = "DAA_Algorithms_Time-Complexities_Details.xlsx"
df.to_excel(excel_path, index=False)
print("\nExcel file saved successfully at:", excel_path)