# TEST DRIVEN DEVELOPMENT

### TDD Life Cycle

1. Write the test
2. Run the test (there is no implementation code, test does not pass)
3. Write just enough implementation code to make the test pass
4. Run all tests (tests pass)
5. Refactor
6. Repeat


### Best practice

1. Separate implementation from test code
2. Place test classes in the same package as implementation
3. Name test classes in a similar fashion as classes they test
4. Use descriptive names for test methods 
    - Given/When/Then syntax (BDD)


### Processes

1. Write the test before writing the implementation code
2. Only write new code when test is failing
3. Rerun all tests every time implementation code changes
4. All tests should pass before new test is written
5. Refactor only after all tests are passing


### Development Practices

1. Write the simplest code to pass the test
2. Write assertions first, act later
3. Minimize assertions in each test
4. Do not introduce dependencies between tests
5. Tests should run fast
6. Use mocks
7. Use setup and tear-down methods
8. Do not use base classes
9. Use TDD together with BDD

### Other

1. Unit tests are not integration tests
