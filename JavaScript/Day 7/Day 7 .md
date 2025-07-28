Day 7

Date = 28/07/2025

Topic Covered = In JavaScript

                1]CallBack Function
                2]Promise
                3]setTimeout
                4]setInterval
                5]URL


* CallBack Function

-A callback is a function passed as an argument to be executed later (e.g. after an operation completes).

-Commonly used in asynchronous APIs like setTimeout, addEventListener, filesystem, network calls.

-Leads to callback hell when nested deeply, making code hard to read and maintain.


* Promise

-A Promise represents an eventual result of an asynchronous operation (MDN) 

-States: pending → fulfilled (resolve) or rejected (reject).

-Enables chaining via .then() and .catch() for cleaner flow control.

-Useful to avoid nesting callbacks and better error handling (StackOverflow)


* setTimeout

-Executes a function once after a specified delay in milliseconds.

-Syntax: setTimeout(fn, delay) 

-fn should be a function reference, not the result of a function call.


* setInterval

-Calls a function every specified interval repeatedly until cleared.


* URL

-A URL identifies and locates a resource via a network address

-javaScript’s URL constructor parses and manipulates URLs using properties like protocol, hostname, pathname, search, hash, and searchParams

