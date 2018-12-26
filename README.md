# stardew-tracker

Big shoutout to John Cleaver (kihashi) for his work on the stardew community checklist.
This is meant to be a re-write of his application in Clojure.

## Development

Open a terminal and type `lein repl` to start a Clojure REPL
(interactive prompt).

In the REPL, type

```clojure
(go)
(cljs-repl)
```

The call to `(go)` starts the Figwheel server at port 3449, which takes care of
live reloading ClojureScript code and CSS, and the app server at port 10555 
which forwards requests to the http-handler you define.

Running `(cljs-repl)` starts the Figwheel ClojureScript REPL. Evaluating
expressions here will only work once you've loaded the page, so the browser can
connect to Figwheel.

When you see the line `Successfully compiled "resources/public/app.js" in 21.36
seconds.`, you're ready to go. Browse to `http://localhost:10555` and enjoy.

**Attention: It is not needed to run `lein figwheel` separately. Instead `(go)`
launches Figwheel directly from the REPL**

## Trying it out

If all is well you now have a browser window saying 'Hello Chestnut',
and a REPL prompt that looks like `cljs.user=>`.

Open `resources/public/css/style.css` and change some styling of the
H1 element. Notice how it's updated instantly in the browser.

Open `src/cljs/stardew-tracker/core.cljs`, and change `dom/h1` to
`dom/h2`. As soon as you save the file, your browser is updated.

In the REPL, type

```
(ns stardew-tracker.core)
(swap! app-state assoc :text "Interactivity FTW")
```

Notice again how the browser updates.

## Testing

To run the Clojure tests, use

``` shell
lein test
```

To run the Clojurescript you use [doo](https://github.com/bensu/doo). This can
run your tests against a variety of JavaScript implementations, but in the
browser and "headless". For example, to test with PhantomJS, use

``` shell
lein doo phantom
```

## Deploying to Heroku

This assumes you have a
[Heroku account](https://signup.heroku.com/dc), have installed the
[Heroku toolbelt](https://toolbelt.heroku.com/), and have done a
`heroku login` before.

``` sh
git init
git add -A
git commit
heroku create
git push heroku master:master
heroku open
```

## Running with Foreman

Heroku uses [Foreman](http://ddollar.github.io/foreman/) to run your
app, which uses the `Procfile` in your repository to figure out which
server command to run. Heroku also compiles and runs your code with a
Leiningen "production" profile, instead of "dev". To locally simulate
what Heroku does you can do:

``` sh
lein with-profile -dev,+production uberjar && foreman start
```

Now your app is running at
[http://localhost:5000](http://localhost:5000) in production mode.

## License

Copyright © 2016 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

## Chestnut

Created with [Chestnut](http://plexus.github.io/chestnut/) 0.16.0 (67651e9d).
