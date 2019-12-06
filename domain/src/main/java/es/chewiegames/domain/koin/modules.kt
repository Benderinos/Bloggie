package es.chewiegames.domain.koin

import es.chewiegames.domain.usecases.comments.StoreCommentUseCase
import es.chewiegames.domain.usecases.comments.StoreReplyUseCase
import es.chewiegames.domain.usecases.feedpost.GetFeedPostUseCase
import es.chewiegames.domain.usecases.feedpost.GetLikedPostsByUserUseCase
import es.chewiegames.domain.usecases.feedpost.SubscribeFeedPostsUseCase
import es.chewiegames.domain.usecases.feedpost.UpdateLikedPostUseCase
import es.chewiegames.domain.usecases.newpost.StoreNewPostUseCase
import es.chewiegames.domain.usecases.post.UpdatePostUseCase
import es.chewiegames.domain.usecases.user.CheckUserLoginUseCase
import es.chewiegames.domain.usecases.user.RegisterUserUseCase
import org.koin.dsl.module.module

val domainModule = module {

    /**
     * Use cases
     */
    single { CheckUserLoginUseCase(repository = get()) }
    single { RegisterUserUseCase(repository = get()) }
    single { GetFeedPostUseCase(repository = get()) }
    single { GetLikedPostsByUserUseCase(repository = get()) }
    single { UpdateLikedPostUseCase(repository = get()) }
    single { StoreNewPostUseCase(repository = get()) }
    single { SubscribeFeedPostsUseCase(repository = get()) }
    single { UpdatePostUseCase(repository = get()) }
    single { StoreCommentUseCase(repository = get()) }
    single { StoreReplyUseCase(repository = get()) }
}
