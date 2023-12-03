## **ComposableViewTalkBack project**

By ROY WATSON, rwatson@roywatson.com, 12/3/2023.



*Note*: It is highly recommended that the reader familiarize themselves with the demonstration project at https://github.com/roywatson/AndroidViewTalkBack prior to running this application. This is a follow up to that original project.

### Introduction:

We have been experiencing difficulties with TalkBack apparently as a result of using an `AndroidView` as a container for a Readium fragment. See a more detailed description at https://github.com/roywatson/AndroidViewTalkBack.

This demonstrator creates a View based application with the "bedrock" content contained in Fragment defined in a traditional XML layout file.

A ComposeView is used to overlay content on top of the bedrock content.

### Purpose of this Demonstration Project: 

To investigate whether, as an alternative to using an `AndroidView`, setting the app up as a View based app with Compose added using a `ComposeView` could avoid the issues experienced in the AndroidViewTalkBack demonstration project referenced above.

### Observed Behavior:

In this example the overlaying scrim does prevent the TalkBack focus to be given to the underlying XML content by "leaking" tap events. 

However, traversal does not behave as expected. Tapping on the scrim gives TalkBack focus to the scrim ... that is expected. Swiping right traverses through the 3 topbar "Settings" buttons ... this too is expected. The next right swipe traverses to the underlying XML content ... this is not expected.continuing to swipe right proceeds through the underlying XML content and eventually focuses on the underlying "BUTTON BUTTON BUTTON" widget which captures a double tap and closes the scrim ... this is not the expected behavior.

### Attempted resolutions:

I only attempted a few obvious mods. This project is removed enough from out current reality that I don't feel that it warrants a great deal of time or effort. Should this emerge as a viable alternative then we can use this demonstrator a basis to build upon.

### Conclusion:

There are enough unexpected TalkBack behaviors in the demonstrator that as it now stands, that I do NOT believe this architecture presents a preferable alternative to our current design.

Related Experiments:

Original demonstration: https://github.com/roywatson/AndroidViewTalkBack









