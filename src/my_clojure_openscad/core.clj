(ns my-clojure-openscad.core
  (:use [scad-clj scad model]))

(def primitives
  (union
    (cube 100 100 100)
    (sphere (/ 120 2))
    (cylinder 10 150)))

(defn -main [& args]
  (spit "target/post-demo.scad"
    (write-scad primitives)))

