# Sorting Project #
- - - -
## About ##
This project covers 3 algorithms that find the 
ascending order of given Integer arrays, Arrays Lists 
containing integers or a Generic type of collection. 
- - - -
### Bubble Sort ###
Bubble sort works at looking at 2 separate elements next 
to one another to see which is greater. Then determines whether
to swap the elements in the collection or to keep them the same
depending on if the end collection will be either ascending
or descending. Here the collection provided will be in 
ascending order.
- - - -
### Quick Sort ###
This Quicksort works by picking a value to be the pivot and 
through this, is able to create partitions that consist of higher
and values compared to the pivot. This goes on eventually until the 
collection is sorted out through the "divide and conquer" method.
- - - -
### Binary Tree Sort ###
The Binary Tree sort is quite a complicated algorithm to implement
as there are many object that have to be dealt with, as well as only 
using specific methods to complete certain functionality. Here you will
see everything being made separately so eventually they can come together
and work to traverse using the in-order, meaning ascending. It will first
look at the root, then have a look at the left most node(child of the 
node being looked at currently) and then and only then will the 
right node(child) be checked after making sure that there are no longer
any left nodes unvisited. 
- - - -
### Generics in general ###
Generic methods were implemented within the project as
seen in most classes. Implementing generics was very similar to
the regular methods but they did have challenges that I came across 
specifically where creating,initialising and returning the same 
collection type(T[]).
- - - -
<details>
    <summary>Design Pattern</summary>
    <p>Singleton - Logging using log4j</p>
    <p>An example of using Singleton is where logging through
log4j. Within the class used to create methods for different
types of logging was quick and direct. This reduced the
amount of duplication of code.</p>
</details>

<details>
    <summary>Interface</summary>
    <p>Contained all methods that were used in all main 
        sort classes</p>
    <p> The 3 methods on the interface helped when coming to 
readability as well as calling certain methods. This was helpful
as all were seperated though the specific collection inputed and 
collection returned. </p>
</details>

<details>
    <summary>Arrays Lists</summary>
    My approach to array lists was to change them into 
arrays and use the same functionality used for arrays. Then converting
then back into ArrayList<Integer> so they can be returned defined
by the method. 
</details>

<details>
    <summary>Timing</summary>
    <p>For timings, I used System.nanoTime() to record what the time
was at the moment within long variables named "startTime" and "endTime". These were 
then subtracted against one another to find the duration of the method.</p>
</details>


