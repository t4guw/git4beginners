---
layout: default
---

# Recommendations for Faculty

By Lizzy Presland, June 2020

Teaching core concepts to UWB students (both underclassmen and upperclassmen) can appear daunting. It is my opinion that every faculty member at UWB is well-equipped to rise to this challenge; at the time of writing, the largest proponent of `git` literacy at the school has been spearheaded by students and student groups. While there is nothing wrong with this, and the students who have taken the lead in helping their academic community embrace this vital toolset, none of the students at UWB have training or meaningful experience in developing pedagogical programs and cannot provide lasting influence in the development of school-wide curriculum.

Beyond the fact that faculty are better equipped to teach `git`, it is also my firm belief that improving the `git` literacy of faculty and students alike will reap many hereto unforeseen benefits. 

This document lists some of my advice to faculty who wish to explore the use of the GitHub Classroom platform as a teaching tool for CSS courses at the freshman level and beyond.

## Choose git tooling carefully

Students who are in 342 & 343 can easily be taught how to use git with the CSS computing clusters. Familiarity with the command line interface for `git` is, in my opinion, essential for success in industry, but more importantly, it is a core part of understanding the `git` workflow for individual contributors and _using commands with purpose and intent_.

However, for students in CSS 142/143, the current curricula do not leave room for command line familiarity, and there is no way to provide consistent access to a single interface for `git`. For these reasons, it is our recommendation, albeit a begrudging recommendation, to teach `git` usage using GitHub Desktop, GitKraken, or another GUI tool for `git` which is free to access for all students.

## Work with QSC Tutors to Provide Additional Resources to Students

If GitHub Classroom is to be used as a teaching platform for CSS classes, it is important to ensure that students have outside resources to lean on for interacting with `git` and GitHub; it is an obvious extension of providing tutoring resources for students for the core concepts and learning objectives of 100-level classes.

Ensure that CSS tutors are prepared to assist students with GitHub setup and `git` commands, and that they are familiar with the GUI/CLI tool you choose to use as the primary teaching tool for `git`.

## Lesson Plan Topics

Beyond the learning objectives of the existing CSS curricula, there are **two key concepts** which should be taught to students who are taking a GitHub Classroom course:

1. Basic `git` and GitHub usage: Cloning repositories, creating commits, and pushing changes to GitHub.
2. How to configure their development environment; specifically how to initialize a "project" in their IDE using an existing directory in their filesystem. This is particularly important for streamlining the editing process for assignments which are in cloned repositories.

### Lesson: My First GitHub Project

A laboratory class might spend 2 hours so that students can complete the following tasks:

1. Create a GitHub account; submit a Canvas assignment which has their username and a link to their profile page on GitHub.
2. Create a new repository of their own choosing.
3. Create a file in that repository which contains simple text -- it could be a joke, or say what they had for breakfast/lunch/dinner. It doesn't matter what the content is; the important takeaway is the process **tracking files** in git, **staging file changes**, and **committing changes**.
4. Commit and push those changes to the repository they just created.

Performing these tasks should be reinforced with continuous usage of the platform throughout the quarter, as well as written materials for Windows/Mac users to reference (cheat sheet for `git` commands).

### Lesson: Hello, GitHub Classroom!

As an additional set of exercises, it would be great to create a simple assignment so that students can get used to the process of accepting and completing an assignment through GitHub Classroom.

A set of exercises might look something like:

1. Accept an assignment via a Classroom link.
2. Write a "hello world" program in Java.
3. Commit and push those changes to GitHub.
4. Confirm that the compilation Action runs successfully; fix any syntax errors which occur in the student's code. (e.g. missing semicolons, missing curly braces...)
5. Add additional requirements for the assignment -- class methods, additional print statements, or anything else you choose. Exercises like this might be an opportunity for students to interact with the `git` ecosystem without being stressed about the core requirements of the course assignments.
6. In order to practice the mechanics of staging, committing, and pushing code, you might want to consider a minimum number of commits in this repository in order to get a perfect grade on the assignment.

## Incentivize GitHub Kung-fu

For a 100-level coding class, it might be worth offering extra credit for students who add a basic report to their repository in the README. Assignment instructions can be moved to a separate markdown file to reduce visual clutter, and linked internally on the repo's README for visibility.

