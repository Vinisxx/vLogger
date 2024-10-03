# vLogger

vLogger is a simple and flexible logging library built in Java. It allows developers to log messages to both console and files, with customizable log levels and message formats. It supports different log levels (Info, Debug, Warn, Error) and provides configurable handlers (ConsoleHandler, FileHandler) to define where the log messages should be sent.

## Features

- **Customizable Log Levels**: Built-in support for common log levels (Info, Debug, Warn, Error) with the ability to extend and create custom log levels.
- **Handlers**: Send log messages to the console or write them to a file.
- **Flexible Formatting**: Customize log message formats with the `SimpleFormatter` or create your own.
- **Color Support**: Output colored logs in the console, making it easier to distinguish between log levels.

## Getting Started

### Prerequisites

To use vLogger, you need:

- Java 8 or higher

### Installation

You can clone this repository into your project and create a Logger instance wherever you need.

### Basic Usage

Here's a basic example demonstrating how to use `vLogger` with a `ConsoleHandler`:

```Main.java
import com.codes.vinis.vLogger.Logger;
import com.codes.vinis.vLogger.handler.ConsoleHandler;
import com.codes.vinis.vLogger.handler.FileHandler;
import com.codes.vinis.vLogger.formatter.SimpleFormatter;
import com.codes.vinis.vLogger.utils.factories.FormatterFactory;

public class Main {

    public static void main(String[] args) {

        // Initialize Console Logger
        Logger<Main> consoleLogger = new Logger<>(Main.class, new ConsoleHandler(FormatterFactory.FormatterType.SIMPLE));

        // Log messages to console
        consoleLogger.info("This is an info message.");
        consoleLogger.debug("This is a debug message.");
        consoleLogger.warn("This is a warning message.");
        consoleLogger.error("This is an error message.");

        // Initialize File Logger
        Logger<Main> fileLogger = new Logger<>(Main.class, new FileHandler(FormatterFactory.FormatterType.SIMPLE, "logs.txt"));

        // Log messages to a file
        fileLogger.info("Info logged to file.");
        fileLogger.error("Error logged to file.");
    }
}

         @..@
        (----)
       ( >__< )
       ^^    ^^
