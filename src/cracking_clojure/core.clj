(ns cracking-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
  
(defn isUnique
  [args]
  (= (count args) (count(distinct args)))
  )

(defn checkPermutation [args args2]
(= (sort args) (sort args2))

)

(defn insert20s [args ]


(clojure.string/join "%20" (clojure.string/split args #"\s")))
