instantiation is an activity that shouldn’t always be done in public and can often lead to coupling problems.

When you see “new,” think “concrete.”

Yes, when you use the new operator you are certainly instantiating a concrete class, so that’s definitely an implementation 
and not an interface. And you make a good observation: that tying your code to a concrete class can make it more fragile and less flexible.
