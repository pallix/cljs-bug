(defproject cljs-bug "0.1.0-SNAPSHOT"
  :description "Project reproducing a ClojureScript or lein cljsbuild bug causing JS files to not be compiled"
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[lein-cljsbuild "0.3.0"]]
  :cljsbuild {:builds
              [{:id "dev",
                :source-paths ["src-cljs"
                               ;; "clojurescript/src/clj"
                               ;; "clojurescript/src/cljs"
                               ],
                :compiler {:pretty-print true,
                           :libs ["src-js/libs"]
                           :output-to "resources/compiled-app.js",
                           :optimizations :whitespace},
                :jar true}
               ]})
