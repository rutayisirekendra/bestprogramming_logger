Logger

1.What is logging

Logging is the process of recording events, messages, or other information that occurs within a software application. These logs can contain a variety of data, such as error messages, warnings, informational messages, and debugging details. Logs are typically stored in log files, databases, or other storage systems and can be used for monitoring, troubleshooting, and analyzing the behavior of an application.
 
2. Why is logging important?
   
·  Troubleshooting and Debugging: Logs provide insights into what the application was doing at a specific point in time, making it easier to identify and resolve issues.

·  Monitoring and Alerting: Logs can be monitored to detect anomalies or errors, allowing for proactive identification of issues and quick response.

·  Performance Analysis: Logs can help in understanding the performance characteristics of an application and identifying bottlenecks or inefficiencies.

·  Security: Logs can record unauthorized access attempts, changes to sensitive data, and other security-related events, helping to detect and respond to security threats.

·  Compliance and Auditing: Logs can be used to demonstrate compliance with regulatory requirements by providing a historical record of application activities.

3. Understanding Logging levels
   
Logging levels categorize the severity or importance of the messages being logged. Common logging levels include:

1.DEBUG:
The DEBUG level is used to log detailed information that is useful primarily for debugging purposes. These messages provide insights into the application's internal workings and help developers trace the execution flow and understand how data is being manipulated.

-> Examples: Method entry, validation checks.

When to Use:
. During development and testing phases to diagnose issues.

. When you need to understand the application's behavior in a detailed manner.

2.INFO: used to log informational messages that highlight the progress of the application at a high level. These messages provide a general overview of the application's execution and significant events but do not include the detailed, low-level information found in DEBUG logs.

-> Examples include: Application Startup and Shutdown,User Actions.

-> When to Use:
.To record normal operations of the application.

.To log significant milestones or events, such as application startup, shutdown, or the completion of major tasks.

3.WARN: To indicate potential issues or situations that may require attention but do not stop the application from functioning.
-> Examples include:Configuration warnings,Deprecated API usage

-> When to Use:
.When encountering conditions that are unusual or could lead to problems if not addressed.

.To alert developers or administrators of potential issues that may need investigation.

4.ERROR: To indicate significant issues or errors that might still allow the application to continue running but indicate a problem that needs attention.

-> Examples include: Exception handling,failed operations

-> When to Use:
.When catching exceptions or handling errors that need attention but do not necessarily halt the application.

.For logging events that could impact the application’s functionality.

5.FATAL: Very severe error events that will presumably lead the application to abort. Used for critical issues that require immediate attention.

-> Examples: System failures, critical data corruption

-> When to Use:
.For critical issues that will cause the application to abort or major functionality to fail.

.When an immediate response is required to prevent catastrophic failures.

6.TRACE: Provides extremely detailed information than the DEBUG level, often used to trace the execution of the application.

-> Examples: Method call tracing,Detailed state changes.

-> When to Use:
.For in-depth analysis and troubleshooting, especially during development or debugging.

