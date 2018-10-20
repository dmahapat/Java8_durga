package com.pluralsight.customcollectors;
/*
*  Collector is made of 3 elements
*   1. the first element is used to build the resulting container - e.g ArrayList,HashMap
*   2. second element adds an object from the stream to the container- e.g it adds an object to an ArrayList
*   3. third element is used for parallelism - it is used to merge together 2 partially filled containers
* */
public class CustomCollectorExample1 {
    public static void main(String[] args) {
        // Building an empty container in case of an ArrayList
        /*
        * Collectors.Characteristics
        *  - IDENTITY_FINISH
        *  - CONCURRENT
        *  - UNORDERED
        *
        * While counting the number of unique elements in a stream
        * collection.stream()
        *           .distinct()
        *           .count()
        * which actor has worked in how many movies
        * actors.stream()
        *       .collect(
        *       Collectors.groupingBy(
        *           actor -> actor,//replace this by Function.identity()
        *           Collections.counting()
        *       )
        *       ).entrySet().stream()
        *       .max(Comparator.comparing(entry -> entry.getValue())//replace this by Map.Entry.comparingByValue()
        *       ).get()
        *
        *
        *  actors that played in greatest number of movies in a year
        *  movies.stream()
        *        .collect(
        *        Collectors.groupingBy(
        *               movie -> movie.releaseYear,
        *               Collector.of(
        *               () -> new HashMap<Actor,AtomicLong>(),//supplier,Atomic long is used in concurrent programming
        *               (map,movie) -> {
        *                   movie.actors().forEach(
        *                   actor->map.computeIfAbsent(actor,a->new AtomicLong()).incrementAndGet())
        *               },//accumulator
        *               (map1,map2) -> {
        *                   map2.entrySet().forEach(
        *                   entry2 -> map1.merge(
        *                   entry2.getKey(),entry2.getValue()))
        *               }//combiner
        *               )
        *             )
        *          )
        * */
    }
}
