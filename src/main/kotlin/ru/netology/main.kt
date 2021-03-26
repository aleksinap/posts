package ru.netology

import ru.netology.data.*
import ru.netology.service.WallService

fun main() {
    val post = Post(
        id = 1,
        ownerId = 12,
        fromId = 123,
        createdBy = 1234,
        date = 12345,
        text = "Привет Нетология",
        replyOwnerId = 123456,
        replyPostId = 1234567,
        friendsOnly = false,
        comments = Comment(
            count = 1,
            canPost = true,
            groupsCanPost = true,
            canClose = false,
            canOpen = false
        ),
        copyright = Copyright(
            id = 12345678,
            link = "ru.netology",
            name = "Нетология",
            type = "Неизвестно"
        ),
        likes = Like(
            count = 121,
            userLikes = false,
            canLike = true,
            canPublish = false
        ),
        reposts = Repost(
            count = 1,
            userReposted = false
        ),
        views = View(25),
        postType = "post",
        signerId = 2345,
        canPin = true,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = true,
        donut = Donut(
            isDonut = false,
            paidDuration = 1234567890,
            placeholder = Placeholder(),
            canPublishFreeCopy = false,
            editMode = "duration"
        ),
        postponedId = 12345
    )
    val service = WallService
}