(defproject my_clojure_openscad "0.1.0-SNAPSHOT"
  :description "Template for projects
that create 3D objects from Clojure code using OpenSCAD in the background"
  :license {:name "Unlicense"
            :url "http://unlicense.org/"}
  :dependencies [
    [org.clojure/clojure "1.8.0"]
    [scad-clj "0.5.2"]
    ]
  :main ^:skip-aot my-clojure-openscad.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

