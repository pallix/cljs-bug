(defproject cljs-bug "0.1.0-SNAPSHOT"
  :description "Project reproducing a ClojureScript or lein cljsbuild bug causing JS files to not be compiled"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1859"]]
  :plugins [[lein-cljsbuild "0.3.4"]]
  :source-paths ["src-cljs" "src-js" "src-js2" "src"],
  :cljsbuild {:builds
              {:dev {
                     :compiler {:pretty-print true,
                                :libs [""]
                                :output-to "resources/compiled-app.js",
                                :optimizations :whitespace},
                     :jar true}}
              })
