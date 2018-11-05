[![from_flaxo with_♥](https://img.shields.io/badge/from_flaxo-with_♥-blue.svg)](https://github.com/tcibinan/flaxo)

# Data2viz Force-Directed Graph

> D3 port of the original [force-directed graph](https://beta.observablehq.com/@mbostock/d3-force-directed-graph).

Force-Directed Graph visualization tool based on the incredible 
[data2viz](https://github.com/data2viz/data2viz) library.

![plagiarism graph](docs/images/plagiarism_graph.png?raw=true)

The original tool is a Kotlin-JS project which can be altered to use in desktop or Android easily 
using Kotlin multiplatform capabilities.

Contributions are more than welcome.

## Controls

Tool has four configurable preferences:
 - Plagiarism weight **threshold**.
 - Graph links absolute **shift**.
 - Graph links relative **scale**.
 - Plagiarism weight **normalization** strategy which has 3 available values:
   - **disabled** normalization which basically means that weights are just scaled by 100,
   - **max** normalization which means that weights are scaled by the maximum weight,
   - **collapsing** normalization that normalizes weights as a binary function: all weights
   that are above the set threshold are scaled to 1 and 0 otherwise.

## Data

Example shows anonymized data of a plagiarism report that was collected for an actual programming university course.

## Building

To start the development server run the command and open the browser at [http://localhost:8088/](http://localhost:8088/)

```bash
./gradlew run
```

To stop the development server run the following command

```bash
./gradlew stop
```
