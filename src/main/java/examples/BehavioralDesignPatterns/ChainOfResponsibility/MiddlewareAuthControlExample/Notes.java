package examples.BehavioralDesignPatterns.ChainOfResponsibility.MiddlewareAuthControlExample;

public class Notes {

    /**
     * Filtering access
     *
     * This example shows how a request containing user data passes a sequential chain of handlers that perform various things such as authentication, authorization, and validation.
     *
     * This example is a bit different from the canonical version of the pattern given by various authors.
     * Most of the pattern examples are built on the notion of looking for the right handler,
     * launching it and exiting the chain after that.
     * But here we execute every handler until there’s one that can’t handle a request.
     * Be aware that this still is the Chain of Responsibility pattern, even though the flow is a bit different.
     */
}
