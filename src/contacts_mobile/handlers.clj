(ns contacts-mobile.handlers)

(defn hello [request]
  {:status  200
   :headers {"Content-Type" "text/text"}
   :body    "Hello world!"})

(defn contacts-handler [request]
  {:status  200
   :headers {"Content-Type" "text/text"}
   :body    "Hello Contacts!"})