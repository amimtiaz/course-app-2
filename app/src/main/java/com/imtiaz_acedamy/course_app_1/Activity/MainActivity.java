package com.imtiaz_acedamy.course_app_1.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.SearchView;
import android.widget.Toast;

import com.imtiaz_acedamy.course_app_1.Adapter.CouseAdapter;
import com.imtiaz_acedamy.course_app_1.Domain.CouseDomain;
import com.imtiaz_acedamy.course_app_1.R;
import com.imtiaz_acedamy.course_app_1.databinding.ActivityIntroBinding;
import com.imtiaz_acedamy.course_app_1.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    /* Owner Imtiaz || mail: info.devimtiaz@gmail.com */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        initRecyclerView();
        wishListView();
        searchBarView();

        Window window = MainActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.white));

        /* Owner Imtiaz || mail: info.devimtiaz@gmail.com */
    }

    private void searchBarView() {
        binding.editTextText.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                performSearch(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return true;
            }
        });
    }

    private void wishListView() {
        binding.wishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, WishListActivity.class));

            }
        });
    }

    private void initRecyclerView() {

        // array list here...
        ArrayList<CouseDomain> itemsArrayList = new ArrayList<>();
        itemsArrayList.add(new CouseDomain("Quick Learn C# Language", "Jammie Young", 130, 4.2, "pic1", "This disease can cause blindness. We have no idea what has happened to cause people to stay away. " +
                " If you have an icon that is already white, you can simply use it directly. Ensure that the icon you're using has a transparent background, so it adapts to different background colors.Are you a course creator looking to boost your sales and reach a wider audience? In today's competitive online learning landscape, effectively marketing and selling your courses is essential for success. Here are some strategies to help you maximize your course sales:\n" +
                "\n" +
                "Identify Your Target Audience: Understanding who your courses are designed for is crucial. Conduct market research to identify your target audience's needs, preferences, and pain points. Tailor your course content and marketing efforts to address these specific needs.\n" +
                "\n" +
                "Create Compelling Course Content: High-quality content is key to attracting and retaining students. Develop courses that offer valuable insights, practical skills, and engaging learning experiences. Utilize multimedia elements such as videos, quizzes, and interactive assignments to enhance course engagement."));
        itemsArrayList.add(new CouseDomain("Full Course android kotlin", "ALex Alba", 460, 4.6, "pic2", "Are you a course creator looking to boost your sales and reach a wider audience? In today's competitive online learning landscape, effectively marketing and selling your courses is essential for success. Here are some strategies to help you maximize your course sales:\n" +
                "\n" +
                "Identify Your Target Audience: Understanding who your courses are designed for is crucial. Conduct market research to identify your target audience's needs, preferences, and pain points. Tailor your course content and marketing efforts to address these specific needs.\n" +
                "\n" +
                "Create Compelling Course Content: High-quality content is key to attracting and retaining students. Develop courses that offer valuable insights, practical skills, and engaging learning experiences. Utilize multimedia elements such as videos, quizzes, and interactive assignments to enhance course engagement.\n" +
                "\n" +
                "Optimize Your Sales Page: Your course sales page is often the first point of contact for potential students. Optimize it for conversions by including persuasive copy, clear course benefits, and compelling visuals. Use testimonials, case studies, and social proof to build credibility and trust with prospective buyers.\n" +
                "\n" +
                "Offer Limited-Time Promotions: Create a sense of urgency and incentivize purchases by offering limited-time promotions and discounts. Host flash sales, holiday specials, or early bird discounts to encourage prospective students to enroll in your courses quickly.\n" +
                "\n" +
                "Utilize Email Marketing: Build an email list of potential students and nurture relationships through targeted email marketing campaigns. Send out regular newsletters, course updates, and exclusive offers to keep your audience engaged and informed about your offerings.\n" +
                "\n" +
                "Leverage Social Media: Use social media platforms to promote your courses, engage with your audience, and drive traffic to your sales pages. Share valuable content, behind-the-scenes insights, and student success stories to build a loyal following and generate interest in your courses.\n" +
                "\n" +
                "Collaborate with Influencers: Partner with influencers, industry experts, or affiliate marketers to extend your reach and tap into their existing audience networks. Collaborative promotions and endorsements can help increase course visibility and credibility, leading to higher sales conversions.\n" +
                "\n" +
                "Provide Exceptional Customer Support: Deliver outstanding customer support to ensure a positive learning experience for your students. Address inquiries promptly, offer personalized assistance, and actively seek feedback to continuously improve your courses and customer satisfaction."));
        itemsArrayList.add(new CouseDomain("Quick Learn C# Language", "Jammie Young", 130, 4.3, "pic_3", "Are you a course creator looking to boost your sales and reach a wider audience? In today's competitive online learning landscape, effectively marketing and selling your courses is essential for success. Here are some strategies to help you maximize your course sales:\n" +
                "\n" +
                "Identify Your Target Audience: Understanding who your courses are designed for is crucial. Conduct market research to identify your target audience's needs, preferences, and pain points. Tailor your course content and marketing efforts to address these specific needs.\n" +
                "\n" +
                "Create Compelling Course Content: High-quality content is key to attracting and retaining students. Develop courses that offer valuable insights, practical skills, and engaging learning experiences. Utilize multimedia elements such as videos, quizzes, and interactive assignments to enhance course engagement.\n" +
                "\n" +
                "Optimize Your Sales Page: Your course sales page is often the first point of contact for potential students. Optimize it for conversions by including persuasive copy, clear course benefits, and compelling visuals. Use testimonials, case studies, and social proof to build credibility and trust with prospective buyers.\n" +
                "\n" +
                "Offer Limited-Time Promotions: Create a sense of urgency and incentivize purchases by offering limited-time promotions and discounts. Host flash sales, holiday specials, or early bird discounts to encourage prospective students to enroll in your courses quickly.\n" +
                "\n" +
                "Utilize Email Marketing: Build an email list of potential students and nurture relationships through targeted email marketing campaigns. Send out regular newsletters, course updates, and exclusive offers to keep your audience engaged and informed about your offerings.\n" +
                "\n" +
                "Leverage Social Media: Use social media platforms to promote your courses, engage with your audience, and drive traffic to your sales pages. Share valuable content, behind-the-scenes insights, and student success stories to build a loyal following and generate interest in your courses.\n" +
                "\n" +
                "Collaborate with Influencers: Partner with influencers, industry experts, or affiliate marketers to extend your reach and tap into their existing audience networks. Collaborative promotions and endorsements can help increase course visibility and credibility, leading to higher sales conversions.\n" +
                "\n" +
                "Provide Exceptional Customer Support: Deliver outstanding customer support to ensure a positive learning experience for your students. Address inquiries promptly, offer personalized assistance, and actively seek feedback to continuously improve your courses and customer satisfaction."));
        itemsArrayList.add(new CouseDomain("Quick Learn C# Language", "Jammie Young", 130, 4.2, "pic_4", "Are you a course creator looking to boost your sales and reach a wider audience? In today's competitive online learning landscape, effectively marketing and selling your courses is essential for success. Here are some strategies to help you maximize your course sales:\n" +
                "\n" +
                "Identify Your Target Audience: Understanding who your courses are designed for is crucial. Conduct market research to identify your target audience's needs, preferences, and pain points. Tailor your course content and marketing efforts to address these specific needs.\n" +
                "\n" +
                "Create Compelling Course Content: High-quality content is key to attracting and retaining students. Develop courses that offer valuable insights, practical skills, and engaging learning experiences. Utilize multimedia elements such as videos, quizzes, and interactive assignments to enhance course engagement.\n" +
                "\n" +
                "Optimize Your Sales Page: Your course sales page is often the first point of contact for potential students. Optimize it for conversions by including persuasive copy, clear course benefits, and compelling visuals. Use testimonials, case studies, and social proof to build credibility and trust with prospective buyers.\n" +
                "\n" +
                "Offer Limited-Time Promotions: Create a sense of urgency and incentivize purchases by offering limited-time promotions and discounts. Host flash sales, holiday specials, or early bird discounts to encourage prospective students to enroll in your courses quickly.\n" +
                "\n" +
                "Utilize Email Marketing: Build an email list of potential students and nurture relationships through targeted email marketing campaigns. Send out regular newsletters, course updates, and exclusive offers to keep your audience engaged and informed about your offerings.\n" +
                "\n" +
                "Leverage Social Media: Use social media platforms to promote your courses, engage with your audience, and drive traffic to your sales pages. Share valuable content, behind-the-scenes insights, and student success stories to build a loyal following and generate interest in your courses.\n" +
                "\n" +
                "Collaborate with Influencers: Partner with influencers, industry experts, or affiliate marketers to extend your reach and tap into their existing audience networks. Collaborative promotions and endorsements can help increase course visibility and credibility, leading to higher sales conversions.\n" +
                "\n" +
                "Provide Exceptional Customer Support: Deliver outstanding customer support to ensure a positive learning experience for your students. Address inquiries promptly, offer personalized assistance, and actively seek feedback to continuously improve your courses and customer satisfaction."));
        itemsArrayList.add(new CouseDomain("Full Course android kotlin", "ALex Alba", 460, 4.6, "pic_5", "Are you a course creator looking to boost your sales and reach a wider audience? In today's competitive online learning landscape, effectively marketing and selling your courses is essential for success. Here are some strategies to help you maximize your course sales:\n" +
                "\n" +
                "Identify Your Target Audience: Understanding who your courses are designed for is crucial. Conduct market research to identify your target audience's needs, preferences, and pain points. Tailor your course content and marketing efforts to address these specific needs.\n" +
                "\n" +
                "Create Compelling Course Content: High-quality content is key to attracting and retaining students. Develop courses that offer valuable insights, practical skills, and engaging learning experiences. Utilize multimedia elements such as videos, quizzes, and interactive assignments to enhance course engagement.\n" +
                "\n" +
                "Optimize Your Sales Page: Your course sales page is often the first point of contact for potential students. Optimize it for conversions by including persuasive copy, clear course benefits, and compelling visuals. Use testimonials, case studies, and social proof to build credibility and trust with prospective buyers.\n" +
                "\n" +
                "Offer Limited-Time Promotions: Create a sense of urgency and incentivize purchases by offering limited-time promotions and discounts. Host flash sales, holiday specials, or early bird discounts to encourage prospective students to enroll in your courses quickly.\n" +
                "\n" +
                "Utilize Email Marketing: Build an email list of potential students and nurture relationships through targeted email marketing campaigns. Send out regular newsletters, course updates, and exclusive offers to keep your audience engaged and informed about your offerings.\n" +
                "\n" +
                "Leverage Social Media: Use social media platforms to promote your courses, engage with your audience, and drive traffic to your sales pages. Share valuable content, behind-the-scenes insights, and student success stories to build a loyal following and generate interest in your courses.\n" +
                "\n" +
                "Collaborate with Influencers: Partner with influencers, industry experts, or affiliate marketers to extend your reach and tap into their existing audience networks. Collaborative promotions and endorsements can help increase course visibility and credibility, leading to higher sales conversions.\n" +
                "\n" +
                "Provide Exceptional Customer Support: Deliver outstanding customer support to ensure a positive learning experience for your students. Address inquiries promptly, offer personalized assistance, and actively seek feedback to continuously improve your courses and customer satisfaction."));
        itemsArrayList.add(new CouseDomain("Quick Learn C# Language", "Jammie Young", 130, 4.3, "pic_6", "Are you a course creator looking to boost your sales and reach a wider audience? In today's competitive online learning landscape, effectively marketing and selling your courses is essential for success. Here are some strategies to help you maximize your course sales:\n" +
                "\n" +
                "Identify Your Target Audience: Understanding who your courses are designed for is crucial. Conduct market research to identify your target audience's needs, preferences, and pain points. Tailor your course content and marketing efforts to address these specific needs.\n" +
                "\n" +
                "Create Compelling Course Content: High-quality content is key to attracting and retaining students. Develop courses that offer valuable insights, practical skills, and engaging learning experiences. Utilize multimedia elements such as videos, quizzes, and interactive assignments to enhance course engagement.\n" +
                "\n" +
                "Optimize Your Sales Page: Your course sales page is often the first point of contact for potential students. Optimize it for conversions by including persuasive copy, clear course benefits, and compelling visuals. Use testimonials, case studies, and social proof to build credibility and trust with prospective buyers.\n" +
                "\n" +
                "Offer Limited-Time Promotions: Create a sense of urgency and incentivize purchases by offering limited-time promotions and discounts. Host flash sales, holiday specials, or early bird discounts to encourage prospective students to enroll in your courses quickly.\n" +
                "\n" +
                "Utilize Email Marketing: Build an email list of potential students and nurture relationships through targeted email marketing campaigns. Send out regular newsletters, course updates, and exclusive offers to keep your audience engaged and informed about your offerings.\n" +
                "\n" +
                "Leverage Social Media: Use social media platforms to promote your courses, engage with your audience, and drive traffic to your sales pages. Share valuable content, behind-the-scenes insights, and student success stories to build a loyal following and generate interest in your courses.\n" +
                "\n" +
                "Collaborate with Influencers: Partner with influencers, industry experts, or affiliate marketers to extend your reach and tap into their existing audience networks. Collaborative promotions and endorsements can help increase course visibility and credibility, leading to higher sales conversions.\n" +
                "\n" +
                "Provide Exceptional Customer Support: Deliver outstanding customer support to ensure a positive learning experience for your students. Address inquiries promptly, offer personalized assistance, and actively seek feedback to continuously improve your courses and customer satisfaction."));


        //adapter start here...
        binding.popularView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.popularView.setAdapter(new CouseAdapter(itemsArrayList));


    }

    private void performSearch(String query) {
        // Implement your search logic here
        // This method is called when the user submits the search query
        List<String> dataList = Arrays.asList("Apple", "Banana", "Orange", "Pineapple", "Grapes");
        List<String> searchResults = new ArrayList<>();

        // Perform case-insensitive search
        for (String item : dataList) {
            if (item.toLowerCase().contains(query.toLowerCase())) {
                searchResults.add(item);
            }
        }

        // Display search results
        if (!searchResults.isEmpty()) {
            StringBuilder resultMessage = new StringBuilder("Search Results:\n");
            for (String result : searchResults) {
                resultMessage.append(result).append("\n");
            }
            Toast.makeText(this, resultMessage.toString(), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "No matching results found", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Searching for: " + query, Toast.LENGTH_SHORT).show();
    }

    /* Owner Imtiaz || mail: info.devimtiaz@gmail.com */
}