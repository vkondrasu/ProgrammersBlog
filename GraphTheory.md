##Graph Theory

Applications 

Map - finding fastest route from one city to another 

Web content - essential in searching the web

Circuits - Is there a short-circuit present?

Schedules - Certain process can't be started untill a set of prvious tasks are completed. Respecting those constraints and scheduling task to be completed in minimu amount of time.

Commerce - to track buy/sell transactions and trasfer of goods and cash between different parties.

Matching - Applicants to positions.

Computer Networks

Software - A compiler builds a graph to represent the dependencies between different modules in a large software system. We need to analyze this graph to determine to how best we can allocate resources to various components.

Social networks - connections between friends or followers.

4 most important types of graphs

UnDirected Graphs 

Directed Graphs

Edge-weighted Graphs

Edge-weighted Di-Graphs

Same graph can be drawn in different ways.
Two edges connecting the same pair of vertices are parallel. 
Self-loop is an the edge that connects a vertex with it-self.

When there is an edge connecting two vertices, we say that they are adjacent to each other and that edge is incident to both vertices. The degree of vertex is the number of edges incident to it.

A sub graph is a subset of edges and the associated vertices.

An acyclic graph is a graph with no cycles.

A tree - is an acyclic connected graph
Forest - A disjoint set of trees.
A spanning tree - A sub graph that contains all of the edges and is a tree
A spanning forest - Union of spaniing trees of it's connected component

A Graph G with V vertices is a tree if and only if
  #1. G has V-1 edges and no cycle
  #2. G has V-1 edges and is connected.
  #3. G is connected but removing an edge makes it disconnected.
  #4. G is acyclic but adding an edge creates a cycle.
  #5. Exactly one simple path connects each pair of vertices G.


Biperate Graph - A Graph whose vertices can be divided into 2 sets such that each edge connects a vertex from one set to another.

#1. Nonrecursive depth-first search. Implement depth-first search in an undirected graph without using recursion.

#2. Diameter and center of a tree. Given a connected graph with no cycles

Diameter: design a linear-time algorithm to find the longest simple path in the graph.
Center: design a linear-time algorithm to find a vertex such that its maximum distance from any other vertex is minimized.

#3. Euler cycle. An Euler cycle in a graph is a cycle (not necessarily simple) that uses every edge in the graph exactly one.

Show that a connected graph has an Euler cycle if and only if every vertex has even degree.
Design a linear-time algorithm to determine whether a graph has an Euler cycle, and if so, find one.


