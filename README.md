# my_clojure_openscad

This is a tiny sample project, serving as a template for projects
that want to create 3D objects from Clojure code,
using OpenSCAD as an intermediary format.

## Installation

You need:
* leiningen
* OpenSCAD

## Usage

Generate "post-demo.scad" from Clojure code:

    $ lein run

Display the generated file using OpenSCAD:

	$ openscad "target/post-demo.scad"

## License

This is free and unencumbered software released into the public domain.
Se the LICENSE file for further information.

