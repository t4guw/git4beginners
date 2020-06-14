# Table of Contents

* [What is `git`?](#what)
* [Installing `git`](#install)
  * [GitHub Desktop (recommended for new users)](#install-ghdesktop)
  * [Command Line Installation](#install-cli)
* [How to use Git](#usage)
  * [Basic Concepts](#usage-basic)
  * [Instructions for GitHub Classroom Assignments](#usage-classroom)
* [FAQ](#faq)

<a name="what"/>

# What is `git`?

`git` is [version control software](https://en.wikipedia.org/wiki/Version_control). 
It lets you track and record changes that you make to a project you're working on. 

[GitHub](https://github.com/) is a platform that lets you back up your project to the cloud. 
It can store any project that you are using `git` with.

In this case, you'll use `git` and GitHub to upload homework assignments. Your 
professor will be able to see your work, grade it automatically, and 
give you feedback on your code. Some feedback will be provided each 
time you send new changes to GitHub.

<a name="install"/>

# Installing `git`

<a name="install-ghdesktop"/>

## GitHub Desktop (recommended for new users)

1. Navigate to: https://desktop.github.com/ and download GitHub Desktop
2. Run the setup
3. Sign in using your Git Hub credentials. (Create an account if you don't already have one)

<a name="install-cli"/>

## Command Line Installation

If you use a package manager (like `brew` on MacOS or `apt` on Debian-based Linux), 
you can install `git` with that package manager.

You can also install `git` for any operating system from the 
[official website](https://git-scm.com/downloads).

<a name="usage"/>

# How to use Git

<a name="usage-basic"/>

## Basic Concepts

You can work on a project using any IDE or text editor you choose. You 
can add almost any type of file you might need to a project -- code files, plain text 
files, images, audio files, and even PDFs and PowerPoint presentations.

`git` can track all of these files, but you, the user, have to tell the 
software when you're ready to save the changes you've made to the project. 
Saving changes in a project is called **committing**.

Here's how the commit process works:

![local commits diagram](/assets/using_git_locally.png)

As the user, you also have to tell `git` when you're ready to display 
your commits on GitHub so that professors and graders can see your work. 

![syncing repository with github](/assets/using_git_with_github.png)

A typical workflow that you will be using to complete your assignments: 

1. **Set up the assignment.** Follow your professor's instructions to get a copy of the assignment 
   you need to complete. This will create a _repository_ associated with your GitHub account.
2. **_Clone_ the assignment to your computer.** This will get you a copy 
   of all of the starter code and documentation your professor set up for you. 
   When you clone an assignment, you get to choose where on your file system 
   your assignment will be stored. A good practice is to make a directory in 
   your `Documents` folder called `code` for all your school coding assignments, and 
   put each of your assignments in that folder.
3. **Write the code you need to write.** You can use any IDE or text editor 
   your professor allows you to use; `git` doesn't care about _how_ you 
   make changes to the project, only _which changes you make_.
4. **_Stage_ your changes to include them in a commit.** `git` will only 
   commit changes to files that you explicitly want, so you have to tell 
   `git` what changes to commit. In the command line, you use the command `git add`.
5. **Commit your changes.** After you've selected which changes you want to 
   save to your `git` repository, you can tell `git` to record those changes 
   to your code in a commit.
6. **Upload your changes to GitHub.** Push your new commit(s) to GitHub to 
   get the newest version of your code into the GitHub repository.

You can repeat steps 3-6 as many times as you like.

<a name="usage-classroom"/>

## Instructions for GitHub Classroom Assignments

1. We can use Git to get our homework and submit it.
  1. Git clone allows us to copy our repository (our online project file) to our computer.
  You can configure where you want to put the project but remember where you save it to.
  ![Git Clone](/assets/Git_Clone.gif)
2. Submitting your code (commiting and pushing). We commit our code to save the current state and `push` our code to the cloud.
  ![Git Push](/assets/Git_Push.gif)
  2. The message I type in the box can be seen as a comment for that commit on the online repository.
  3. After submission, you can hope to see some notification if your push passed or not.
3. Read the Readme.md for each of your assignments to learn what you need to change in that repository for submission.

If you need any more referece material, refer to: https://github.com/UWB-ACM/Git-Gud-Workshop and review the powerpoint slides.

<a name="faq"/>

# FAQ

> Why do I need to save my assignments to `git` specifically? Don't my code files already get saved to my computer?

Mechanically speaking, `git` doesn't automatically assume that you're ready to commit your changes every time you save changes to the files that you're working on (ie write those changes to your computer's hard drive). `git` also doesn't track changes to your entire computer, only the specific projects that you tell it to track. So, even if you save your code when you're working in an IDE or text editor, you have to take the extra step to tell `git` that you're ready to upload those changes to GitHub.

> Why are we using GitHub at all?

There are a few reasons why we've decided to use `git` for homework assignments in classes at UW Bothell. The biggest reasons are:

* `git` is used by 85% of professional software engineers; knowing how to use this essential tool will help you be productive in your job and internship searches.
* Using GitHub lets the professors and graders provide processes for you to see your progress in action. By uploading your changes to GitHub while you're working on your assignment, GitHub will check to make sure your code compiles, run basic tests on your code, and check for simple requirements like 80-character line lengths and documentation comments (`/** */`) in all of your Java classes. Getting this feedback quickly will help you know what you need to work on to get the best grade you can for that assignment.

> How do I learn more about using `git`?

At UW Bothell, the [ACM student club](https://uwbacm.com) hosts `git` workshops during most academic quarters, and has a community of fellow students that can help you get familiar with `git`.

There are a ton of good resources online about what makes `git` a powerful tool for developers. We have listed a few great resources for starting to learn how to use this software. Most of these guides are geared toward the command line.

* [GitHub's Learning Lab](https://lab.github.com/) is full of easy projects to help you get started with `git` and GitHub. It's a great way to learn the basics, and each exercise gives you immediate feedback on what you did well at, and tells you what you need to work on.
* [TowardsDataScience](https://towardsdatascience.com/getting-started-with-git-and-github-6fcd0f2d4ac6) has a good article on basic usage.
* [An entire list of awesome GitHub resources for new users](https://github.com/phillipadsmith/awesome-github#infomation-for-people-who-are-new-to-github) is available, and includes interactive tutorials, YouTube videos and playlists, and great documentation resources.
