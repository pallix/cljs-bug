(ns a.main
  ;; imported from a JS file
  (:require [a.hello :as hello]))

(defn -main
  []
  (hello/hello_world))

(-main)
