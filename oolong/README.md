# Module oolong

## Oolong

Oolong is an [Elm](https://guide.elm-lang.org/architecture) inspired Model-View-Update (MVU) implementation for Kotiln multiplatform. As the name implies, three core concepts comprise the foundation of this architecture: 

* **Model** - a type to represent the program state

* **Update** - a function to update the state

* **View** - a function to map the state to view properties

By applying this simple pattern you can create composable, testable programs that can run on any platform. Oolong enables a common codebase for all platforms by using a `render` function which is implemented by each frontend.

# Package oolong
The Oolong runtime and types.

# Package oolong.util.delay
Utility functions for creating delay effects.

# Package oolong.util.effect
Utility functions for creating effects.

# Package oolong.util.random
Utility functions for creating random effects.
