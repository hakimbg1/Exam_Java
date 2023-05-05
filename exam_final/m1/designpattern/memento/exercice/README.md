# Implement memento design pattern

In the Exercises project, look at the code in the `m1.designpattern.memento.exercice/Document` class.
This class represents a document in a word processor like MS Word or Apple Pages.  
The `Document` class has three attributes:
- `content`
- `fontName`
- `fontSize`

You should allow the user to undo the changes to any of these attributes.
In the future, you may add additional attributes in this class and these attributes should also be undoable.
Implement the undo feature using the `memento pattern`. 