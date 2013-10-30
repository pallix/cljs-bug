(defproject cljs-bug "0.1.0-SNAPSHOT"
  :description "Project reproducing a ClojureScript or lein cljsbuild bug causing JS files to not be compiled"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1859"]]
  :plugins [[lein-cljsbuild "0.3.4"]]
  :cljsbuild {:builds
              {:dev {:source-paths ["src-cljs"],
                     :compiler {:pretty-print true,
                                :libs ["src-js/libs"]
                                :output-to "resources/compiled-app.js",
                                :optimizations :whitespace},
                     :jar true}}
              })
