# Scala + Google Cloud Functions

## Run

`mvn function:run` then visit http://localhost:8080

## deploy

Run:

`gcloud functions deploy scala-helloworld --entry-point com.github.angelmunoz.scalagcloud.GloudFn --runtime java11 --trigger-http --allow-unauthenticated --memory 512MB`
